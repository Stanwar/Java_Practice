// Composition : HAS-A Relation
interface Sorting{
	List sort(List list);
}

class MergeSort implements Sorting{
	public List sort(List list){
		return list;
	}
}

class QuickSort implements Sorting{
	public List sort(List list){
		return list;
	}
}

class DynamicDataset {
	Sorting sort;
	DynamicDataset(){
		sort = new MergeSort();
	}
}

class SnapshotDataset{
	Sorting sort;
	SnapshotDataset(){
		sort = new QuickSort();
	}
}