package org.mskcc.oncotree.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import org.mskcc.oncotree.utils.TumorTypesUtil;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.InputStream;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
@RequestMapping(value = "/api/tumor_types.txt", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/tumor_types.txt", description = "the tumor_types.txt API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-04-04T17:16:11.368Z")
public class TumorTypesTxtApi {


    @ApiOperation(value = "Tumor Types in plain text format.", notes = "Return all available tumor types.", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Tumor types text file.") })
    @RequestMapping(value = "",
        produces = { "text/plain" },
        method = RequestMethod.GET)
    public ResponseEntity<InputStreamResource> tumorTypesTxtGet() {
        InputStream inputStream = TumorTypesUtil.getTumorTypeInputStream();
        InputStreamResource inputStreamResource = new InputStreamResource(inputStream);
        return new ResponseEntity<>(inputStreamResource, HttpStatus.OK);
    }
}
