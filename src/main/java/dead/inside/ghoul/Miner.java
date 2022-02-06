package dead.inside.ghoul;

import org.springframework.beans.factory.annotation.Autowired;

public class Miner {
    private IAlgorithm algorithm;

    @Autowired
    Miner(IAlgorithm iAlgorithm){
        this.algorithm = iAlgorithm;
    }

    void run(){
        System.out.println("Miner runned...");
        algorithm.run();
    }
}
