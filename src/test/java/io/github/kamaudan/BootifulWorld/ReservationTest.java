package io.github.kamaudan.BootifulWorld;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.BDDAssertions;
import org.junit.Assert;
import org.junit.Test;

public class ReservationTest {

    @Test
    public  void creation(){
        Reservation r = new Reservation(1L, "June");
        Assert.assertEquals(r.getId(), (Long) 1L);
        Assertions.assertThat(r.getId()).isEqualTo(1L);
        Assertions.assertThat(r.getReservationName()).isNotBlank();
        Assertions.assertThat(r.getReservationName()).isEqualTo("June");

    }
}
