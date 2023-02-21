def first_last6(nums):
    
    if len(nums) == 1:
        
        return sum(nums) == 6
    
    else:
        
        first_last = []
    
        first_last.append(nums[0])
        
        first_last.append(nums[len(nums)-1])
        
        return 6 in first_last