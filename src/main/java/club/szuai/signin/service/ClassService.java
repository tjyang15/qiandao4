package club.szuai.signin.service;

import club.szuai.signin.bean.Class;

import java.util.List;

public interface ClassService {

    int addClass(Class classes);

    List<Class> getList(int limit);

}