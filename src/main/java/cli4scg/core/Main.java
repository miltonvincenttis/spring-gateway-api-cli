package cli4scg.core;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main implements QuarkusApplication {
    
    @Override
    public int run(final String... args) throws Exception {
        Main.main(args);
        
        return 10;
    }
    
    public static void main(String[] args) {
        System.out.println("   .d8888b.  888      8888888    d8888   .d8888b.   .d8888b.   .d8888b.  ");
        System.out.println("  d88P  Y88b 888        888     d8P888  d88P  Y88b d88P  Y88b d88P  Y88b ");
        System.out.println("  888    888 888        888    d8P 888  Y88b.      888    888 888    888 ");
        System.out.println("  888        888        888   d8P  888   \"Y888b.   888        888        ");
        System.out.println("  888        888        888  d88   888      \"Y88b. 888        888  88888");
        System.out.println("  888    888 888        888  8888888888       \"888 888    888 888    888");
        System.out.println("  Y88b  d88P 888        888        888  Y88b  d88P Y88b  d88P Y88b  d88P ");
        System.out.println("   \"Y8888P\"  88888888 8888888      888   \"Y8888P\"   \"Y8888P\"   \"Y8888P88 ");
        System.out.println("                                Version: 0.0.1");
    }
    
    

}
