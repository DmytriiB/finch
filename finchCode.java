public class TestingFinch{
  public static void main(String[] args){
    Finch f = new Finch();
    setMove("F",100.0,100.0);
    int left = myFinch.getLeftObstacleSensor();
    int right = myFinch.getRightObstacleSensor();

    if(left > 0 || right > 0){
      f.setMotors(0.0,0.0);
      f.setTurn("R",90,100);
      f.setMotors(100.0,100.0);
    }
    else{
      f.setMotors(100.0,100.0);
    }
    
