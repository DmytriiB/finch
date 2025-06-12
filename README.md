# finch-robot

### Development Checklist

  | Completed | Task         | Description |
  |:---------:|:------------:|:------------|
  |     ✅    | Familiarize  | Learn how to: <ul><li>Connect to the robot</li><li>Understand built-in features of the robot</li><li>Setup local developing environment to code in Java</li></ul>|
  |     ✅    | 3D Design    | Develop 3D Design of a new feature for the robot |
  |     ✅    | Develop Code | Develop code in Java for what your robot will be doing |

---

<details>
<summary><strong>Inspiration for the Project</strong></summary>

I wanted to create something similar to futuristic patrol security robots that have a flashlight on top and they are moving around the room forever.
</details>

---

### Design Cycle
<img src="https://github.com/user-attachments/assets/831d4fc7-bd87-47d4-a97d-28ad73f424b8" width="350" height="350">

During this project activity i used this design cycle when i was designing my flashlight holder where my first prototype was too small where flashlight couldnt fit so i redesigned it and adjusted the size so the flashlight could fit.

---

### Code to Highlight
```java
 int left = myFinch.getLeftObstacleSensor();
    int right = myFinch.getRightObstacleSensor();

    if(left > 0 || right > 0){
```

---
