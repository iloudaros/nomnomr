import java.util.ArrayList;

public class CategoryList {
    ArrayList<Category> list = new ArrayList<Category>();


    public ArrayList<Category> getCategories() {
        return this.list;
    }

    public void addCategory(Category newCategory) {
        list.add(newCategory);
    }

    public void mergeCategoryList(CategoryList CatListToMerge) {
        this.list.addAll(CatListToMerge.list);
    }
}
