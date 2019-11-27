package inject.namespace;

/**
 * @author 南八
 */
public class MySqlFactory {
    private  MyDataSource dataSource;


    public MySqlFactory(MyDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public MyDataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(MyDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String toString() {
        return "MySqlFactory{" +
                "dataSource=" + dataSource +
                '}';
    }
}
