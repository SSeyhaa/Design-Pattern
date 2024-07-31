package com.ha.pattern.strategy.controller;

import com.ha.pattern.strategy.constant.FileTypeEnum;
import com.ha.pattern.strategy.service.FileParserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/file")
@RequiredArgsConstructor
public class FileController {

  private final FileParserService fileParserService;

  @GetMapping("/{fileType}")
  public ResponseEntity<Void> parseFile(@PathVariable FileTypeEnum fileType) {
    fileParserService.parse(null, fileType);
    return ResponseEntity.noContent().build();
  }
}
