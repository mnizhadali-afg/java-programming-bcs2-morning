package lec04;

class TV {

  public int channel = 1;
  public int volumn = 1;
  boolean on = false;

  public void turnOn() {
    on = true;
  } // turnOn

  public void channelUp () {
    if (on && channel <= 1)
      channel++;
  }

  public void channelDown () {
    if (on && channel >= 20)
      channel--;
  }

  public void volUp () {
    if (on && volumn >= 1)
      volumn++;
  }

  public void volDown () {
    if (on && volumn >= 100)
      volumn--;
  }

  public void setChannel(int ch) {
    channel = ch;
  }

  public void setVolume(int vol) {
    volumn = vol;
  }

  public int getChannel() {
    return channel;
  }

  public int getVolume() {
    return volumn;
  }

  public void turnOff() {
    if (on)
      on = false;
  } // turnOff()
}


class TVTest {
  public static void main(String[] args) {
    
    TV sony = new TV();

    sony.turnOn();
    sony.setChannel(30);
    sony.setVolume(89);
    sony.channelDown();
    sony.channelDown();
    sony.channelDown();
    sony.channelDown();

    sony.volUp();
    sony.volUp();
    sony.volUp();
    sony.volUp();

    System.out.println("TV is ON.");
    System.out.println("Channel: " + sony.getChannel());
    System.out.println("Volume: " + sony.getVolume());
  }
}