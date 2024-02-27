package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WalletTest {

    @Test
    void testOwner() {
        List<Card> listKartu = new ArrayList<Card>();
        listKartu.add(new Card("Esti", "89123231478", "BNI"));

        Wallet wallet = new Wallet(
                new Owner("Naiya",17),
                listKartu,30000.0
        );
        Wallet wallet2 = new Wallet(
                new Owner("Esti",17),
                listKartu,40000.0
        );

//        // assertEquals: Memeriksa apakah nama pemilik wallet adalah "Naiya"
//        assertEquals("Naiya", wallet.getOwner().getNama());
//
//        // assertEquals: Memeriksa apakah penarikan uang berjalan dengan benar
//        assertEquals(10000.0, wallet.withdraw(10000.0));
//
//        // assertSame: Memeriksa apakah wallet dan wallet2 merujuk pada objek yang sama
//        assertSame(wallet, wallet2);
//
//        // assertEquals: Memeriksa nama bank pada kartu pertama dalam wallet
//        assertEquals("BNI", wallet.getCards().get(0).getNamaBank());

        // assertNotNull: Memeriksa apakah wallet tidak null
        assertNotNull(wallet);

//        // assertTrue: Memeriksa apakah nilai saldo wallet positif
//        assertTrue(wallet.getCash() > 0);
//
//        // assertFalse: Memeriksa apakah wallet tidak kosong
//        assertFalse(wallet.getCards().isEmpty());
    }

    @Test
    void setOwner() {
        // Implementasikan pengujian untuk setOwner
    }

    @Test
    void getCards() {
        // Implementasikan pengujian untuk getCards
    }

    @Test
    void setCards() {
        // Implementasikan pengujian untuk setCards
    }

    @Test
    void getCash() {
        // Implementasikan pengujian untuk getCash
    }

    @Test
    void setCash(){
        // Implementasikan pengujian untuk setCash
    }
}
