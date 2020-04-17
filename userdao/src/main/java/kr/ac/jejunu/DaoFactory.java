package kr.ac.jejunu;

//의존성 전문적 관리 - di_dependency injection - spring > 클라이언트 전달
public class DaoFactory {
    public UserDao getUserDao() {
        return new UserDao(getConnectionMaker());
    }

    private JejuConnectionMaker getConnectionMaker() {
        return new JejuConnectionMaker();
    }
}
