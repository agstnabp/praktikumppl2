import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {

    @Test
    void penjumlahanNilaiPositive() {
        Kalkulator kalk = new Kalkulator(2,3);
        //tampung
        int hasil = kalk.penjumlahan();
        assertEquals(5,hasil);
    }

    @Test
    void penjumlahanNilaiNegative() {
        Kalkulator kalk = new Kalkulator(-2,-5);
        //tampung
        int hasil = kalk.penjumlahan();
        assertEquals(-7,hasil);
//        assertNull(hasil);
    }
}