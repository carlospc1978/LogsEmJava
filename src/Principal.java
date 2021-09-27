import lombok.extern.log4j.Log4j2;

@Log4j2
public class Principal {

    public static void main(String[] args) {

        String paraForcarErro="X";

        try {
            int a = Integer.parseInt(paraForcarErro);
        }catch (Exception ex){
//            () -> java.util.logging;
            log.info("");

        }
    }

}
