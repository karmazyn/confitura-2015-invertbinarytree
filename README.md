# [Confitura 2015](http://tech.viacom.com/warsawsdc/confitura2015/)
## Build
``` ./gradlew clean build ```

## Complexity
running time: O(n) - each element is read once, n-1 assignments.

memory: O(1) - inversion done in place
## Invert a Binary Tree

Invert a binary tree.

```
     1
   /   \
  2     3
 / \   / \
4   5 6   7
```
to
```
     1
   /   \
  3     2
 / \   / \
7   6 5   4
```

Data structures:

Scala:
```scala
case class TreeNode(value: Int, left: Option[TreeNode], right: Option[TreeNode])
```

Java:
```java
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
```
You can check contest bye-laws [here](http://tech.viacom.com/warsawsdc/confitura2015/Regulamin_konkurs_Viacom_programmer_adventure_2015.pdf).

Check out our Confitura 2015 site [here](http://tech.viacom.com/warsawsdc/confitura2015/)

We are hiring! Visit our [career site](http://tech.viacom.com/careers/).
