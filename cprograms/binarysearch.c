// Linear Search
#include <stdio.h>
#define SIZE 5
void linearSearch(int arr[SIZE], int);
int main()
{
    int arr[SIZE];
    int target;
    // read the array
    for (int i = 0; i < SIZE; i++)
    {
        printf("\nEnter the element %d : ", i + 1);
        scanf("%d", &arr[i]);
    }
    // take the element you want to search
    printf("\nEnter the element to search: ");
    scanf("%d", &target);
    // call the function
    linearSearch(arr, target);
    return 0;
}
void linearSearch(int arr[SIZE], int target)
{
    for (int i = 0; i < SIZE; i++)
    {
        if (target != arr[i])
        {
            continue;
        }
        else
        {
            printf("\nElement found!");
            return;
        }
    }
    printf("Element not found");
}