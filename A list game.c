#include <stdio.h>
#include <conio.h>

int a(int n)
{
    int a = 0, b = 2;
    while (b*b <= n)
    {
        if (n % b == 0)
        {
            n /= b;
            a++;
        }
        else
        {
            b++;
        }
    }
    return a + 1;
}

int main()
{
    int n;
    scanf("%d", &n);
    printf("%d", a(n));
    return 0;
}
