package io.github.weechang.moreco.rbac.dao;

import io.github.weechang.moreco.rbac.domain.RoleDomain;
import io.github.weechang.moreco.base.dao.JpaDao;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author zhangwei
 * date 2018/10/26
 * time 18:10
 */
@NoRepositoryBean
public interface RoleDao extends JpaDao<RoleDomain> {
}