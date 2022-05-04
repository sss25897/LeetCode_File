public class MyHashSet {

    private List<int> Keys = new List<int>();
    private List<int> Values = new List<int>();
    
    
    public MyHashSet() {
        
    }
    
    public void Add(int key) {
        if(!Keys.Contains(key))
        {
            Keys.Add(key);
        }       
    }
    
    public void Remove(int key) {
        if(Keys.Contains(key))
        {
            Keys.RemoveAt(Keys.IndexOf(key));
        }
    }
    
    public bool Contains(int key) {
        return Keys.Contains(key);        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.Add(key);
 * obj.Remove(key);
 * bool param_3 = obj.Contains(key);
 */