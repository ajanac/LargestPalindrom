/**
 * Created by ajana on 4/9/2017.
 */
public class ProductTwoNumbers {
    int product2NumbersPalindrom(int n){
        int maxProduct=1;
        int product=0;
        int number;
        int reverse;
        int lowerLimit= (int) (Math.pow(10,n-1));

        int upper_limit=lowerLimit*10-1;
        System.out.println("L:"+lowerLimit+" U:"+upper_limit);
        for(int i=upper_limit;i>=lowerLimit;i--){
            for (int j=i;j>=lowerLimit;j--){
                product=i*j;
                //System.out.println("***"+product);
                if(product<maxProduct)
                    break;
                number=product;
                reverse=0;
                while (number!=0){
                    reverse=reverse*10+number%10;
                    number/=10;
                }
                if(reverse==product&& product>maxProduct){
                    maxProduct=product;

                }


            }
        }
        return  (maxProduct%1337);
    }

    public static void main(String[] args) {
        int n=2;
        ProductTwoNumbers productTwoNumbers=new ProductTwoNumbers();
        System.out.println(productTwoNumbers.product2NumbersPalindrom(n));
    }
}
