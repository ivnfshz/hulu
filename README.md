# HULU Exercise.

This project contains the solution to validate if two nodes from a binary tree are cousins or not.

## Prerequisites

This solution requires the following installed tools.
 
* [Git](https://git-scm.com/)
* [Java 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Apache Maven](https://maven.apache.org/)

## Implementation

This project implements the following provided libraries:

* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring Testing](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-testing.html) 
	> Which also contains other provided libraries

* [Apache Commons Lang](https://commons.apache.org/proper/commons-lang/)

## How to install it?

- Open at your preferred terminal. 

- Download this project to your local.

```bash
git clone https://github.com/ivnfshz/hulu.git
```

- Finally, type the following command under the directory project:

```bash
mvn clean install
```

## Usage Details

### Run The Application

- Execute the application by running the following command:

```bash
mvn spring-boot:run
```
- Or if you prefer a different option, under the directory project type:

```bash
cd target/
```
- And then:

```bash
java -jar binary-tree-0.0.1-SNAPSHOT.jar
```

- Once you have run the above commands, you will be able to see the following information:

```bash
====================================
This is the binary tree:
Level: 2 Node: 3
Level: 1 Node: 5
Level: 2 Node: 12
Level: 0 Node: 15
Level: 1 Node: 66
Level: 2 Node: 75
====================================
Enter node A:
```
- The above information represents the binary tree that was loaded form a property source file.

- This is what the binary tree looks like in a simple draw:

```bash
  15        <-- root.
     /    \
   5       66  
  / \     /  \
 3   12  50  75  <-- probably cousins.
```

- If you are interested to change the values of each node, you will find the instructions [here](https://github.com/ivnfshz/hulu#nodes)!

### Instructions

- As you can see, the program asks for a **value node**.

```bash
====================================
Enter node A:
3
```

- Once you have entered the first value, you will be asked to enter the next **value node** to validate them.
```bash
Enter node B:
50
```

- The program will validate if those nodes are cousins based on the binary tree shown before.
- You will see a message with the result as the following example:

```bash
====================================
Enter node A:
3
Enter node B:
50
====================================

Result: 3 is cousin of 50

====================================
```

- Or in case **they were NOT cousins**: 

```bash
Enter node A:
3
Enter node B:
12
====================================

Result: 3 is NOT cousin of 12

====================================
``` 

### Unit Tests.

- If you want to run the unit tests of the application itself, then:

```bash
mvn test
```

-Then, you will see:

```bash
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 6.030 s
[INFO] Finished at: 2018-06-22T03:19:28-05:00
[INFO] Final Memory: 18M/309M
[INFO] ------------------------------------------------------------------------
```

### How to Change the Nodes' Values?

- You just need to edit the next file located under directory project:

```bash
src/main/resources/nodes
```
- It contains a key/value format. 
- You will need to edit the value of the **root.nodes** key at your convenience