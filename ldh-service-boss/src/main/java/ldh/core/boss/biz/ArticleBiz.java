package ldh.core.boss.biz;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ldh.common.page.PageBean;
import ldh.common.page.PageParam;
import ldh.core.boss.dao.ArticleDao;
import ldh.facade.boss.entity.Article;


/**
 * 类描述：1:文章 2:招聘 3:常见问题 4:产品 管理 Biz接口
 */
@Component("articleBiz")
public class ArticleBiz {
	@Autowired
	private ArticleDao articleDao;

	public long create(Article entity) {
		return articleDao.insert(entity);
	}

	public long update(Article entity) {
		return articleDao.update(entity);
	}

	public Article getById(long id) {
		return articleDao.getById(id);
	}

	public Article getBy(Map<String, Object> map) {
		return articleDao.getBy(map);
	}
	
	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) {
		return articleDao.listPage(pageParam, paramMap);
	}

	public List<Article> listBy(Map<String, Object> paramMap) {
		return articleDao.listBy(paramMap);
	}
}
