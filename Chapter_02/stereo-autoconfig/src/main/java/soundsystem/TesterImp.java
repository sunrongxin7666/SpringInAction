package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//组件
//@Component
//如果在配置类中已经声明了Bean就不需要在此声明Component;
public class TesterImp implements ITester {

    private CompactDisc compactDisc;
    private int num;

    @Autowired
    public TesterImp(CompactDisc disc, int num){
        compactDisc = disc;
        this.num = num;
    }
    @Autowired
    public TesterImp(CompactDisc disc){
        this(disc,3);
    }
    public TesterImp(){
        this(null,3);
    }
    @Override
    public void test() {
        compactDisc.play();
        System.out.println("doting test");
    }

    @Override
    public int getNum(){
        return num;
    }
}
