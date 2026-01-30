// OOP Approach (Generic Programming)

#include<iostream>
using namespace std;

template <class T>
class Arithematic
{
    public:
        T No1;
        T No2;

    Arithematic(T A, T B)
    {
        No1 = A;
        No2 = B;
    }

    T Addition()
    {
        T Ans = 0;
        Ans = No1 + No2;
        return Ans;
    }

    T Substraction()
    {
        T Ans = 0;
        Ans = No1 - No2;
        return Ans;
    }

};

int main()
{
    Arithematic <int> aObj1(11,10);  
    Arithematic <double> aObj2(101.5,50.3);

    cout<<"Addition is : "<<aObj1.Addition()<<"\n";
    cout<<"Substraction is : "<<aObj1.Substraction()<<"\n";

    cout<<"Addition is : "<<aObj2.Addition()<<"\n";
    cout<<"Substraction is : "<<aObj2.Substraction()<<"\n";


    return 0;
}