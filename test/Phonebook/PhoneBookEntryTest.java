package Phonebook;

import Week7.PhoneBook;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDateTime;

public class PhoneBookEntryTest {

    private PhoneBookEntry phoneEntry;

    @BeforeEach
    void setUp(){
        phoneEntry = new PhoneBookEntry();
    }
}
