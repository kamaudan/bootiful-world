package io.github.kamaudan.BootifulWorld;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;

@DataJpaTest
@RunWith(SpringRunner.class)
public class ReservationRepositoryTest {

    @Autowired
    private ReservationRepository repository;

    @Test
    public void findByReservationName() {
        this.repository.save(new Reservation(null, "June"));

      Collection<Reservation> byReservationName = this.repository.findByReservationName("June");
      Assertions.assertThat(byReservationName.size()).isEqualTo(1);
      Assertions.assertThat(byReservationName.iterator().next().getId()).isGreaterThan(0);
      Assertions.assertThat(byReservationName.iterator().next().getReservationName()).isEqualTo("June");




    }
}
