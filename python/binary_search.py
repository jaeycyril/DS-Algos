from typing import List


def binary_search(nums: List[int], target: int) -> int:
    left = 0
    right = len(nums) - 1

    while left <= right:
        mid = (left + right) // 2

        if target < nums[mid]:
            right = mid - 1
        elif target > nums[mid]:
            left = mid + 1
        else:
            return mid
    return -1


if __name__ == "__main__":
    num_list = sorted([8, 6, 3, 4, 9, 10, 34, 65])
    target_num = 9
    print(binary_search(num_list, target_num))


