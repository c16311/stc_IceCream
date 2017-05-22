/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IceCream;

/**
 * アイスクリームを作るミキサーのコントローラ
 * 製造上の問題が起きないように、Singletonに書き換えなさい。
 * @author c16311
 */
public class IceCreamMixer {
    private boolean empty;  //ミキサーの中身が空
    private boolean mixed;  //使用済g
    private static IceCreamMixer iceCreamMixer = new IceCreamMixer();
    
    private IceCreamMixer(){
        empty = true;
        mixed = false;
        System.out.println("ミキサーの準備が完了しました。");
    }
    //ミキサーを材料で満たす
    public void fill(){
        //空なら材料で満たす。
        if(isEmpty()){
            System.out.println("ミキサーの中に砂糖・卵・牛乳・生クリーム・バニラエッセンスなどの材料を入れました。");
            //mixer();
        }
        else
            System.out.println("既にミキサーの中身に材料があります。");
        this.empty=false;
    }
    //ミキサーの中身を取り出す
    public void drain(){
        //空ではなく、利用済みなら取り出す。
        if(!isEmpty()&&isMixed())
            System.out.println("ミキサーの中からアイスクリームを取り出します。");
        else if(isEmpty())
            System.out.println("ミキサーの中身が空です。");
        else if(!isMixed())
            System.out.println("まだ、アイスクリームが出来ていません。");
        
        this.empty=true;
        this.mixed=false;
    }
    //ミキサーを利用する
    public void mixer(){
        //空ではなく、まだ使っていないなら利用する。
        if(!isEmpty()&&!isMixed())
            System.out.println("アイスクリームを作ります。");
        else if(isEmpty())
            System.out.println("ミキサーの中身が空です。");
        else if(isMixed())
            System.out.println("既にミキサーで混ぜてあります。");
            
        this.mixed=true;
    }
    //アイスクリームの製造を一括処理にする。
    /*public void create(){
        fill();
        mixer();
        drain();
        
    }*/
    public static IceCreamMixer getInstance(){
        return iceCreamMixer;
    }
    public boolean isEmpty(){return empty;}
    public boolean isMixed(){return mixed;}
}
