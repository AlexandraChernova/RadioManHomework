import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio rad = new Radio();

        rad.setStation(3);

        int expected = 3;
        int actual = rad.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio rad = new Radio();

        rad.currentVolume = 5;

        int expected = 5;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStation() {
        Radio rad = new Radio();

        rad.setMaxStation();

        int expected = 9;
        int actual = rad.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio rad = new Radio();

        rad.setMaxVolume();

        int expected = 10;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio rad = new Radio();

        rad.setStation(11);

        int expected = 0;
        int actual = rad.getStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetZeroStationAfterNine() {
        Radio rad = new Radio();

        rad.setStation(10);

        int expected = 0;
        int actual = rad.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNineStationAfterZero() {
        Radio rad = new Radio();

        rad.setStation(-1);

        int expected = 9;
        int actual = rad.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume(){
        Radio rad = new Radio();
        rad.currentVolume =9;

        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeAboveTen(){
        Radio rad = new Radio();
        rad.currentVolume =10;

        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume(){
        Radio rad = new Radio();
        rad.currentVolume = 3;

        rad.decreaseVolume();

        int expected = 2;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeBelowZero(){
        Radio rad = new Radio();
        rad.currentVolume = 0;

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    }