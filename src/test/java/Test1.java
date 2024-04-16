import org.PruebaAutomatizada.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test1 {
    StringUtils string = new StringUtils();
    @Test
        public void testsumar2palabras(){
        String palabraTerminada = "fuego";
        String palabra1 = "fue";
        String palabra2 = "go";
        String palabra = string.concatenate(palabra1,palabra2);
        Assertions.assertEquals(palabraTerminada,palabra);

    }
    @Test
        public void cantidadDeLetrasDePalabra(){
        int cantidadEsperada = 9;
        String palabra = "Alejandro";
        int CantidadRecibida = string.countCharacters(palabra);
        Assertions.assertEquals(cantidadEsperada,CantidadRecibida);
    }
    @Test
        public void RevertirPalabra(){
        String RevesEsperado = "ordnajelA";
        String palabra = "Alejandro";
        String RevesRecibido = string.reverse(palabra);
        Assertions.assertEquals(RevesEsperado,RevesRecibido);
    }
}