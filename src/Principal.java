import lombok.extern.log4j.Log4j2;

@Log4j2
public class Principal {

    public static void main(String[] args) {

        //TODO
        String paraForcarErro="X";

        System.out.println("testes");

        try {
            int a = Integer.parseInt(paraForcarErro);
        }catch (Exception ex){
//            () -> java.util.logging;
            log.info("erro aqui");
            log.error("erro aqui {} outra {}","primeira","");
            System.out.println("log");

        }
    }

}
