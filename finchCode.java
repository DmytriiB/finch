public class TestingFinch{
  public static void main(String[] args){
    Finch f = new Finch();
    setMove("F",100.0,100.0);
    int left = myFinch.getLeftObstacleSensor();
    int right = myFinch.getRightObstacleSensor();

    if(left > 0 || right > 0){
      setMotors(0.0,0.0);
      setTurn("R",90,100);
      setMotors(100.0,100.0);
    }
    else{
      setMotors(100.0,100.0);
    }
    
