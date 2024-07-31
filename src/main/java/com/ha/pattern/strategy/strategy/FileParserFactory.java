package com.ha.pattern.strategy.strategy;

import com.ha.pattern.strategy.constant.FileTypeEnum;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

@Component
public class FileParserFactory {

  /**
   * Spring boot's dependency injection feature will construct this map for us and include all
   * implementations available in the map with the key as the bean name Logically, the map will look
   * something like below { "CSV": CsvFileParser, "XML": XmlFileParser, "JSON": JsonFileParser }
   */
  private final Map<FileTypeEnum, FileParser> fileParsersMap;

  public FileParserFactory(List<FileParser> fileParsersMap) {
    this.fileParsersMap =
        fileParsersMap.stream()
            .collect(Collectors.toMap(FileParser::getFileType, Function.identity()));
  }

  /**
   * Return's the appropriate FileParser impl given a file type
   *
   * @param fileType one of the file types mentioned in class FileType
   * @return FileParser
   */
  public FileParser get(FileTypeEnum fileType) {
    FileParser fileParser = fileParsersMap.get(fileType);
    if (Objects.isNull(fileParser)) {
      throw new IllegalArgumentException("----- Unsupported file type");
    }
    return fileParser;
  }
}
