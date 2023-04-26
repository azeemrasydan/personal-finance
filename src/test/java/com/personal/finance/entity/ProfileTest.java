package com.personal.finance.entity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProfileTest {
    @Test
    void testGetId(){
        Profile profile = new Profile();
        profile.setId("123");
        assertEquals("123", profile.getId());
    }

    @Test
    void testGetName(){
        Profile profile = new Profile();
        profile.setName("Razak");
        assertEquals("Razak", profile.getName());
    }

}
