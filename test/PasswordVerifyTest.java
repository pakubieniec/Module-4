import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordVerifyTest {
    PasswordVerify pass = new PasswordVerify();
    @Test
    public void passwordHasMoreThenTwelveSign(){
        Assertions.assertEquals(false, pass.hasGoodLength("Milo"));
        Assertions.assertEquals(false , pass.hasGoodLength("Nibylandia"));
        Assertions.assertEquals(true, pass.hasGoodLength("MiloNiblandia"));
    }
    @Test
    public void passwordHasNotWhiteSpaces(){
        Assertions.assertEquals(true, pass.hasNoWhiteSpaces("MiloNibylandia"));
        Assertions.assertEquals(false, pass.hasNoWhiteSpaces("Milo Nibylandia"));
        Assertions.assertEquals(false, pass.hasNoWhiteSpaces("Ala ma kota, kota ma Ala"));
        Assertions.assertEquals(true, pass.hasNoWhiteSpaces("AlaMaKota,KotaMaAla"));
    }
    @Test
    public void passwordhasNoRepetitions(){
        Assertions.assertEquals(true, pass.hasNoRepetitions("MiloNibylandia"));
        Assertions.assertEquals(false, pass.hasNoRepetitions("MilooNibylandia"));
        Assertions.assertEquals(true, pass.hasNoRepetitions("Alamakota,kotamaAla"));
        Assertions.assertEquals(false, pass.hasNoRepetitions("AlaMMaKota,KotaMaAla"));
    }
    @Test
    public void passwordhasNumbers(){
        Assertions.assertEquals(true, pass.hasNumbers("MiloNibylandia1"));
        Assertions.assertEquals(false, pass.hasNumbers("MiloNibylandia"));
        Assertions.assertEquals(true, pass.hasNumbers("Alamakota,kotamaAla23"));
        Assertions.assertEquals(false, pass.hasNumbers("AlaMaKota,KotaMaAla"));
    }

    @Test
    public void passwordhasSpecialCharacter(){
        Assertions.assertEquals(true, pass.hasSpecialCharacter("MiloNibylandia1!"));
        Assertions.assertEquals(false, pass.hasSpecialCharacter("MiloNibylandia"));
        Assertions.assertEquals(true, pass.hasSpecialCharacter("Alamakota,kotamaAla23%"));
        Assertions.assertEquals(false, pass.hasSpecialCharacter("AlaMaKotaKotaMaAla"));
    }
}
