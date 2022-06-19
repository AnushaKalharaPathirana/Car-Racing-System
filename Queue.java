class Queue{
Qnode front,rear;

public Queue()
{
  this.front = this.rear = null;
}
void enqueue(String key)
{
  Qnode temp = new Qnode(key);
  if (this.rear == null){
    this.front = this.rear= temp;
    return;
  }
  this.rear.next = temp;
  this.rear = temp;
}
  void dequeue()
{
  if(this.front == null)
    return;

    Qnode temp = this.front;
    this.front = this.front.next;

    if (this.front == null)
    this.rear = null;

   }
}
