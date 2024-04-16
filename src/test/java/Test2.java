import org.PruebaAutomatizada.ArrayUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test2 {
    ArrayUtils array = new ArrayUtils();
    @Test
        public void TestEncontrarMayor(){
        int numesperado = 10;
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int NumeroRecibido = array.findMax(numeros);
        Assertions.assertEquals(numesperado,NumeroRecibido);
    }
    @Test
        public void TestEncontrarMenor(){
        int numesperado = 1;
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int NumeroRecibido = array.findMin(numeros);
        Assertions.assertEquals(numesperado,NumeroRecibido);
    }
}
