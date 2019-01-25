class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
    
        List<String> subdomainsCount = new ArrayList<String>();
        Map<String,Integer>domain_with_count = new HashMap<String,Integer>();
    
        for(String count_domain : cpdomains){
            int count = Integer.parseInt((count_domain.split(" ")[0]));
            String domain = "."+count_domain.split(" ")[1];            
            while(domain.contains(".")){
                domain = domain.split("\\.",2)[1];                
                if(domain_with_count.containsKey(domain))             
                   domain_with_count.put(domain,(domain_with_count.get(domain) + count));
                else
                    domain_with_count.put(domain,count);            
            }
        }
          for (Map.Entry<String, Integer> d : domain_with_count.entrySet())
                subdomainsCount.add(d.getValue()+" "+ d.getKey());          
        return subdomainsCount;
    }
}
