import org.PruebaAutomatizada.Persons;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class Test3 {
    Persons humano = new Persons();
    @Test
        public void TestNombreCompleto(){
        String FraseEsperada = "Alejandro Gareis";
        String Nombre = "Alejandro";
        String Apellido = "Gareis";
        LocalDate FechaNacimiento = LocalDate.of(2002,6,25);
        humano.Person(Nombre,Apellido,FechaNacimiento);
        String FraseRecibida = humano.getFullName();
        Assertions.assertEquals(FraseEsperada,FraseRecibida);
    }
}
