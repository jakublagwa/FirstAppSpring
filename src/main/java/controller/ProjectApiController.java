package controller;


@Api
@RestController
public class ProjectApiController {

	@Autowired
	private ProjectService project service;
	
	
	//TODO: add my apiexception class
	@ApiOperation(value="adds a project")
	@RequestMapping(path="/api/project", method=RequestMethod.POST)
	public void add(@RequestBody ProjectForm projectForm) throws Exception{
		
	}
	
	@ApiOperation(value="deletes a project")
	@RequestMapping(path="/api/project/{id}", method.RequestMethod.DELETE)
	public void delete(@PathVariable int id){
		
	}
	
	@ApiOperation()
}
