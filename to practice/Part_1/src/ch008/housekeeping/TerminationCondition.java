package ch008.housekeeping;

import ch006.MainDemo;

class Book {
 boolean checkedOut = false;

 // Constructor to set the checkedOut status
 Book(boolean checkOut) {
  checkedOut = checkOut;
 }

 // Method to check in the book
 void checkIn() {
  checkedOut = false;
 }

 @Override
 protected void finalize() throws Throwable {
  try {
   if (checkedOut) {
    System.out.println("Error: checked out.");
   }
   // Normally, you'd call the superclass finalize() method.
   super.finalize();
  } finally {
   // Ensure any finalization done by the base class is completed.
  }
 }
}

public class TerminationCondition {
 public static void main(String[] args) {
  // Creating a new Book instance and checking it out
  Book novel = new Book(true);
  // Properly cleaning up by checking in the book
  novel.checkIn();

  // Creating another Book instance but forgetting to check it in
  new Book(true);

  // Force garbage collection & finalization
  System.gc();

  // The garbage collector runs on a low-priority thread and may not run immediately.
  // Add a delay to give the GC time to run for this demonstration.
  try {
   Thread.sleep(1000);
  } catch (InterruptedException e) {
   e.printStackTrace();
  }
 }
}
