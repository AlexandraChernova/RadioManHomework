public class Radio {
    public int currentStation;
    public int currentVolume;

    public int getStation() {
        return currentStation;
    }

    public void setStation(int newStation) {
        if (newStation < 0) {
            setMaxStation();
            return;
        }
        if (newStation > 9) {
            return;
        }
        currentStation = newStation;
    }

    public int getVolume() {
        return currentVolume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            setMinVolume();
            return;
        }
        if (newVolume >= 10) {
            setMaxVolume();
            return;
        }
    }

    public void setMaxStation() {
        currentStation = 9;
    }

    public void setMaxVolume() {
        currentVolume = 10;
    }

    public void setMinVolume() {
        currentVolume = 0;
    }

    public int increaseVolume() {
        int target = currentVolume + 1;

        if (target > 10) {

            return 10;
        }
        currentVolume = target;
        return target;
    }

    public int decreaseVolume(){
        int target = currentVolume - 1;
        if (target < 0){
            return 0;
        }
        currentVolume = target;
        return target;
    }

}
