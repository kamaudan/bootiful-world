package io.github.kamaudan.BootifulWorld;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;



@DataJpaTest
@RunWith(SpringRunner.class)
public class ReservationJPATest {

    @Autowired
    private TestEntityManager tem;

    @Test
    public void mapping() {

        Reservation june = this.tem.persistFlushFind(new Reservation(null,"June"));
        Assertions.assertThat(june.getReservationName()).isEqualTo("June");
        Assertions.assertThat(june.getId()).isNotNull();
        Assertions.assertThat(june.getId()).isGreaterThan(0);

    }
}
