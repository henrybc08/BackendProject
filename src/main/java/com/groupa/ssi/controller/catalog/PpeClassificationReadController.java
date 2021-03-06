package com.groupa.ssi.controller.catalog;

import com.groupa.ssi.cmd.catalog.PpeClassificationReadCmd;
import com.groupa.ssi.common.response.rest.SingleRestResponse;
import com.groupa.ssi.response.catalog.PpeClassificationResponse;
import com.groupa.ssi.response.catalog.PpeClassificationResponseBuilder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

/**
 * Created on April 25, 2018
 * @author Walker Colina
 */
@Api(
        tags = PpeClassificationAbstractController.TAG_NAME,
        description = PpeClassificationAbstractController.DESCRIPTION
)
@RestController
@RequestScope
public class PpeClassificationReadController extends PpeClassificationAbstractController {

    @Autowired
    private PpeClassificationReadCmd cmd;

    @ApiOperation(value = "Read a personal protection equipment classification")
    @RequestMapping(
            value = "/{ppeClassificationId}",
            method = RequestMethod.GET
    )
    public SingleRestResponse<PpeClassificationResponse> readPpeClassification(@PathVariable Integer ppeClassificationId,
                                                                               @RequestParam(value = "userId", required = false) Integer userId) {
        cmd.setPpeClassificationId(ppeClassificationId);
        cmd.execute();

        return new SingleRestResponse<>(PpeClassificationResponseBuilder.getInstance(cmd.getPpeClassification()).build());
    }

}
