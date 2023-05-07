package ArraylistConcept.com.pms.admin.dao.Impl;
import ArraylistConcept.com.pms.admin.dao.ProductDAO;
import com.pms.model.Product;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

    public class ProductDAOImpl implements ProductDAO {
    Scanner sc =new Scanner(System.in);
    static List<Product> addProducts=new LinkedList<>();
    @Override
    public void addProduct() {
        int k  = 1;
        while (k==1) {
        System.out.println("Enter Product ID =");
        int pid=sc.nextInt();
        System.out.println("Enter Product Name=");
        String pname=sc.next();
        System.out.println("Enter Product quantity =");
        int qty=sc.nextInt();
        System.out.println("Enter Price=");
        int price=sc.nextInt();
        Product product=new Product(pid,pname,qty,price);
        addProducts.add(product);
        System.out.println("Product add successfully");
            System.out.println("Do you want add more Product 1 for Yes / 2 for N");
            k =sc.nextInt();}
            System.out.println(addProducts);
          }

    @Override
    public List<Product> viewProducts() {
        return addProducts;
    }

    @Override
    public Product viewProduct(int pid) {
        for (Product pro :addProducts)
              {
            if (pro.getPid()==pid)
                return pro;
        }
        return null;
    }

    @Override
    public void updateProduct(int pid) {
        int k=0;
        for(Product pro :addProducts )
        {
            if(pro.getPid()==pid){
                System.out.println("Do you want modifiy 1)Name 2)Quantity 3) Price");
                int choice=sc.nextInt();
                System.out.println("Product Before update\n"+pro);
                switch (choice) {
                    case 1:
                        System.out.println("Enter Product name");
                        String pname = sc.next();
                        pro.setPname(pname);
                        System.out.println("Product name is Update");
                        break;
                    case 2:
                        System.out.println("Enter Product Quentity");
                        int qtr = sc.nextInt();
                        pro.setQat(qtr);
                        System.out.println("Product Quantity is update");
                        break;
                    case 3:
                        System.out.println("Enter Product Price");
                        String price = sc.next();
                        pro.setPname(price);
                        System.out.println("Product price is update");
                        break;
                    default:
                        System.out.println(" please Choose 1 to 3");
                   }
                   ++k;
            }}
            if(k==0)
            { System.out.println(" Given record not exit");}
        }
        @Override
        public void deleteProduct(int pid) {
        int k=0;
        for (Product pro :addProducts)
        {
            if (pro.getPid()==pid)
                addProducts.remove(pro);
            System.out.println("Product Deleted successfully");

            k++;
            break;
        }
        if(k==0)
            System.out.println(" Given ID is not exit");

    }
}
