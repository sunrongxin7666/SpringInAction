package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//组件
@Component
public class TesterImp implements ITester {

    private CompactDisc compactDisc;

    @Autowired
    public TesterImp(CompactDisc disc){
        compactDisc = disc;
    }
    @Override
    public void test() {
        compactDisc.play();
        System.out.println("doting test");
    }

    public int getNum(){
        return compactDisc.getMusicNum();
    }
}