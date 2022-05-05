class TwoStack{
	int arr[];
	int size;
	int top1,top2;
	
	TwoStack(int n){
	
	size = n;
	arr = new int[n];
	top1 = n/2+1;
	top2 = n/2;
	}
	void push1(int x){
		arr[++top1] = x;
	}
	
	void push2(int x){
		
		arr[++top2] = x;
	}
	int pop1(){
		
		return arr[top1--];
	}
	
	int pop2(){
		
		return arr[top2--];
	}
}

class Demo{

	public static void main(String args[]){
	TwoStack ts = new TwoStack(10);
	ts.push1(5);
	ts.push2(10);
	ts.push2(15);
	ts.push1(11);
	ts.push2(7);
	ts.push2(40);
	System.out.println("Popped element from stack1 is "+ts.pop1());
	System.out.println("Popped element from stack2 is "+ts.pop2());
	}

}