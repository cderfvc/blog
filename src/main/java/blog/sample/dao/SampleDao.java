package blog.sample.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import blog.common.dao.AbstractDao;

@Repository("sampleDao")
public class SampleDao extends AbstractDao {

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>) selectList("sample.selectBoardList", map);
	}

}
