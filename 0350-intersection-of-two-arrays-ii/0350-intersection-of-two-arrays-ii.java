class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> l1 = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++)
        {
            if(map.containsKey(nums1[i]))
            {
                map.put(nums1[i],map.get(nums1[i])+1);
            }
            else
            {
                map.put(nums1[i],1);
            }
        }
        for(int i = 0; i < nums2.length; i++)
        {
            if(map.containsKey(nums2[i]) && (map.get(nums2[i]) != 0))
            {
                l1.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        int n = l1.size();
        int[] arr = new int[n];
        for(int i = 0; i < l1.size(); i++)
        {
            int a = l1.get(i);
            arr[i] = a;
        }
        return arr;
        

        
    }
}