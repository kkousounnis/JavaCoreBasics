package passobejctclass;
//objects can be passed to methods
class Block {
	int a,b,c;
	int volume;
	
	Block(int a,int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
		volume=this.a*this.b*this.c;
	}
	//return true if ob defines same block.
	boolean sameBlock(Block ob) { //----> Object type parameter
		if ((ob.a == this.a) & ( ob.b==this.b) &(ob.c==this.c))return true;
		else return false;
	}
	boolean sameVolume(Block ob) {
		if (ob.volume==this.volume)return true;
		else return false;
	}
	
	

}
